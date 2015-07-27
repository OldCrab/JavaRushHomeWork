package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by ADM on 07.11.2014.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes s){
        if (s == ImageTypes.JPG)
        return new JpgReader();
        else if (s == ImageTypes.BMP){
            return new BmpReader();
        }
        else {
            if (s == ImageTypes.PNG) {
                return new PngReader();
            } else {
                    throw new  IllegalArgumentException("Неизвестный тип картинки");

            }
        }
    }
}
