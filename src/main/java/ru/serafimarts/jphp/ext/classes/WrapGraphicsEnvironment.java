package ru.serafimarts.jphp.ext.classes;

import java.awt.*;
import java.util.Collection;

import org.develnext.jphp.swing.SwingExtension;
import org.develnext.jphp.swing.classes.WrapFont;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
import ru.serafimarts.jphp.ext.AwtExtension;
import static php.runtime.annotation.Reflection.*;
import org.develnext.jphp.swing.classes.components.support.RootObject;


@Name(AwtExtension.NAMESPACE + "GraphicsEnvironment")
public class WrapGraphicsEnvironment extends RootObject {

    public WrapGraphicsEnvironment(Environment env) {
        super(env);
    }
    public WrapGraphicsEnvironment(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    protected static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    @Signature
    private Memory __construct(Environment env, Memory... args) { return Memory.NULL; }

    @Signature
    public static Memory getDefaultScreenDevice(Environment env, Memory... args) {
        WrapGraphicsDevice gd = new WrapGraphicsDevice(env);
        gd.setGraphicsDevice(ge.getDefaultScreenDevice());
        return ObjectMemory.valueOf(gd);
    }

    @Signature
    public static Memory getLocalGraphicsEnvironment(Environment env, Memory... args) {
        return new ObjectMemory(new WrapGraphicsEnvironment(env));
    }

    @Signature({
        @Arg(value = "font", typeClass = SwingExtension.NAMESPACE + "Font")
    })
    public Memory registerFont(Environment env, Memory... args) {
        ge.registerFont(
            args[0].toObject(WrapFont.class).getFont()
        );
        return Memory.NULL;
    }

    @Signature
    public Memory getAllFonts(Environment env, Memory... args) {
        Font[] fonts = ge.getAllFonts();
        ArrayMemory result = new ArrayMemory();

        for (short i = 0; i < fonts.length; i++) {
            result.add(new ObjectMemory(new WrapFont(env, fonts[i])));
        }

        return result;
    }
}