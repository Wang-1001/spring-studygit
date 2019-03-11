package com.spring;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCode {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300,300);
        config.setMargin(3);
        config.setImg("D:/4.png");
        Color foreColor = new Color(238,110,115);
        Color bgColor = new Color(252,228,236);
        int foreColorRGB = foreColor.getRGB();
        int bgColorRBG = bgColor.getRGB();

        //前景色
        config.setForeColor(foreColorRGB);
        //背景色
        config.setBackColor(bgColorRBG);

        //
        QrCodeUtil.generate("https://www.jianshu.com/writer#/notebooks/35012023/notes/42393607",config,FileUtil.file("d:/w.jpg"));
    }
}
