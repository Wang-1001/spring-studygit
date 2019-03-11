package com.spring;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Aspect
public class ImageHandIer {
    private static final Logger logger = LoggerFactory.getLogger(ImageCopy.class);

    @Pointcut("execution(* com.spring.ImageCopy.copyImage())")
    public  void handIeImage(){

    }

    @Before(value = "handIeImage()")
    public void pressTextOnImage() throws IOException{
        logger.info("开始给图片添加水印...");
        File srcFile = new File("D:/A.jpg");
        File destFile = new File("D:/A1.jpg");



//通过字节流创建一个 BufferedImage对象
        InputStream input = new FileInputStream(srcFile);
        BufferedImage srcImg = ImageIO.read(input);

        int width = srcImg.getWidth();
        int height = srcImg.getHeight();


        Color color = new Color(211,71,38);
        int size = 15;
        Font font = new Font("微软雅黑",Font.BOLD,60);
        String text = "wdw";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width - text.length() * size*4)/ 2,height/ 2 - size,1.0f);
    }

    @AfterReturning("handIeImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白....");
        File srcFile = new File("E:/A1.jpg");
        File destFile = new File("E:/A2.jpg");

        ImageUtil.gray(srcFile,destFile);
    }
}
