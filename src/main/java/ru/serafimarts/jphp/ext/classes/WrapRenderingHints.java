package ru.serafimarts.jphp.ext.classes;


import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import ru.serafimarts.jphp.ext.AwtExtension;
import static php.runtime.annotation.Reflection.Name;
import org.develnext.jphp.swing.classes.components.support.RootObject;



@Name(AwtExtension.NAMESPACE + "RenderingHints")
public class WrapRenderingHints extends RootObject {
    public static final Integer KEY_ANTIALIASING                     = 1;
    public static final Integer VALUE_ANTIALIAS_ON                   = 21;
    public static final Integer VALUE_ANTIALIAS_OFF                  = 22;
    public static final Integer VALUE_ANTIALIAS_DEFAULT              = 23;

    public static final Integer KEY_RENDERING                        = 2;
    public static final Integer VALUE_RENDER_SPEED                   = 24;
    public static final Integer VALUE_RENDER_QUALITY                 = 25;
    public static final Integer VALUE_RENDER_DEFAULT                 = 26;

    public static final Integer KEY_DITHERING                        = 3;
    public static final Integer VALUE_DITHER_DISABLE                 = 27;
    public static final Integer VALUE_DITHER_ENABLE                  = 28;
    public static final Integer VALUE_DITHER_DEFAULT                 = 29;

    public static final Integer KEY_TEXT_ANTIALIASING                = 4;
    public static final Integer VALUE_TEXT_ANTIALIAS_ON              = 30;
    public static final Integer VALUE_TEXT_ANTIALIAS_OFF             = 31;
    public static final Integer VALUE_TEXT_ANTIALIAS_DEFAULT         = 32;
    public static final Integer VALUE_TEXT_ANTIALIAS_GASP            = 33;
    public static final Integer VALUE_TEXT_ANTIALIAS_LCD_HRGB        = 34;
    public static final Integer VALUE_TEXT_ANTIALIAS_LCD_HBGR        = 35;
    public static final Integer VALUE_TEXT_ANTIALIAS_LCD_VRGB        = 36;
    public static final Integer VALUE_TEXT_ANTIALIAS_LCD_VBGR        = 37;

    public static final Integer KEY_TEXT_LCD_CONTRAST                = 5;

    public static final Integer KEY_FRACTIONALMETRICS                = 6;
    public static final Integer VALUE_FRACTIONALMETRICS_OFF          = 38;
    public static final Integer VALUE_FRACTIONALMETRICS_ON           = 39;
    public static final Integer VALUE_FRACTIONALMETRICS_DEFAULT      = 40;

    public static final Integer KEY_INTERPOLATION                    = 7;
    public static final Integer VALUE_INTERPOLATION_NEAREST_NEIGHBOR = 41;
    public static final Integer VALUE_INTERPOLATION_BILINEAR         = 42;
    public static final Integer VALUE_INTERPOLATION_BICUBIC          = 43;

    public static final Integer KEY_ALPHA_INTERPOLATION              = 8;
    public static final Integer VALUE_ALPHA_INTERPOLATION_SPEED      = 44;
    public static final Integer VALUE_ALPHA_INTERPOLATION_QUALITY    = 45;
    public static final Integer VALUE_ALPHA_INTERPOLATION_DEFAULT    = 46;

    public static final Integer KEY_COLOR_RENDERING                  = 9;
    public static final Integer VALUE_COLOR_RENDER_SPEED             = 47;
    public static final Integer VALUE_COLOR_RENDER_QUALITY           = 48;
    public static final Integer VALUE_COLOR_RENDER_DEFAULT           = 49;

    public static final Integer KEY_STROKE_CONTROL                   = 10;
    public static final Integer VALUE_STROKE_DEFAULT                 = 50;
    public static final Integer VALUE_STROKE_NORMALIZE               = 51;
    public static final Integer VALUE_STROKE_PURE                    = 52;


    public WrapRenderingHints(Environment env) {
        super(env);
    }

    public WrapRenderingHints(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    public static Key getOriginalKey(Integer key)
    {
        Key currentKey;

        if (key == WrapRenderingHints.KEY_ANTIALIASING) {
            currentKey = RenderingHints.KEY_ANTIALIASING;

        } else if (key == WrapRenderingHints.KEY_RENDERING) {
            currentKey = RenderingHints.KEY_RENDERING;

        } else if (key == WrapRenderingHints.KEY_DITHERING) {
            currentKey = RenderingHints.KEY_DITHERING;

        } else if (key == WrapRenderingHints.KEY_TEXT_ANTIALIASING) {
            currentKey = RenderingHints.KEY_TEXT_ANTIALIASING;

        } else if (key == WrapRenderingHints.KEY_TEXT_LCD_CONTRAST) {
            currentKey = RenderingHints.KEY_TEXT_LCD_CONTRAST;

        } else if (key == WrapRenderingHints.KEY_FRACTIONALMETRICS) {
            currentKey = RenderingHints.KEY_FRACTIONALMETRICS;

        } else if (key == WrapRenderingHints.KEY_INTERPOLATION) {
            currentKey = RenderingHints.KEY_INTERPOLATION;

        } else if (key == WrapRenderingHints.KEY_ALPHA_INTERPOLATION) {
            currentKey = RenderingHints.KEY_ALPHA_INTERPOLATION;

        } else if (key == WrapRenderingHints.KEY_COLOR_RENDERING) {
            currentKey = RenderingHints.KEY_COLOR_RENDERING;

        } else if (key == WrapRenderingHints.KEY_STROKE_CONTROL) {
            currentKey = RenderingHints.KEY_STROKE_CONTROL;
        } else {
            throw new RuntimeException("Key variable is not a RenderingHint key");
        }

        return currentKey;
    }

    public static Object getOriginalValue(Integer value) {
        Object currentValue;

        if (value == WrapRenderingHints.VALUE_ANTIALIAS_ON) {
            currentValue = RenderingHints.VALUE_ANTIALIAS_ON;

        } else if (value == WrapRenderingHints.VALUE_ANTIALIAS_OFF) {
            currentValue = RenderingHints.VALUE_ANTIALIAS_OFF;

        } else if (value == WrapRenderingHints.VALUE_ANTIALIAS_DEFAULT) {
            currentValue = RenderingHints.VALUE_ANTIALIAS_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_RENDER_SPEED) {
            currentValue = RenderingHints.VALUE_RENDER_SPEED;

        } else if (value == WrapRenderingHints.VALUE_RENDER_QUALITY) {
            currentValue = RenderingHints.VALUE_RENDER_QUALITY;

        } else if (value == WrapRenderingHints.VALUE_RENDER_DEFAULT) {
            currentValue = RenderingHints.VALUE_RENDER_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_DITHER_DISABLE) {
            currentValue = RenderingHints.VALUE_DITHER_DISABLE;

        } else if (value == WrapRenderingHints.VALUE_DITHER_ENABLE) {
            currentValue = RenderingHints.VALUE_DITHER_ENABLE;

        } else if (value == WrapRenderingHints.VALUE_DITHER_DEFAULT) {
            currentValue = RenderingHints.VALUE_DITHER_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_ON) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_ON;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_OFF) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_OFF;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_GASP) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_GASP;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VRGB) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VRGB;

        } else if (value == WrapRenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VBGR) {
            currentValue = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VBGR;

        } else if (value == WrapRenderingHints.VALUE_FRACTIONALMETRICS_OFF) {
            currentValue = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;

        } else if (value == WrapRenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            currentValue = RenderingHints.VALUE_FRACTIONALMETRICS_ON;

        } else if (value == WrapRenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT) {
            currentValue = RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR) {
            currentValue = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;

        } else if (value == WrapRenderingHints.VALUE_INTERPOLATION_BILINEAR) {
            currentValue = RenderingHints.VALUE_INTERPOLATION_BILINEAR;

        } else if (value == WrapRenderingHints.VALUE_INTERPOLATION_BICUBIC) {
            currentValue = RenderingHints.VALUE_INTERPOLATION_BICUBIC;

        } else if (value == WrapRenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED) {
            currentValue = RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED;

        } else if (value == WrapRenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY) {
            currentValue = RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY;

        } else if (value == WrapRenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT) {
            currentValue = RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_COLOR_RENDER_SPEED) {
            currentValue = RenderingHints.VALUE_COLOR_RENDER_SPEED;

        } else if (value == WrapRenderingHints.VALUE_COLOR_RENDER_QUALITY) {
            currentValue = RenderingHints.VALUE_COLOR_RENDER_QUALITY;

        } else if (value == WrapRenderingHints.VALUE_COLOR_RENDER_DEFAULT) {
            currentValue = RenderingHints.VALUE_COLOR_RENDER_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_STROKE_DEFAULT) {
            currentValue = RenderingHints.VALUE_STROKE_DEFAULT;

        } else if (value == WrapRenderingHints.VALUE_STROKE_NORMALIZE) {
            currentValue = RenderingHints.VALUE_STROKE_NORMALIZE;

        } else if (value == WrapRenderingHints.VALUE_STROKE_PURE) {
            currentValue = RenderingHints.VALUE_STROKE_PURE;

        } else {
            throw new RuntimeException("Value variable is not a RenderingHint value");
        }

        return currentValue;
    }
}