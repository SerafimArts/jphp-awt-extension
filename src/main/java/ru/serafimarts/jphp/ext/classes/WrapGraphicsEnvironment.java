package ru.serafimarts.jphp.ext.classes;

import java.awt.*;

import php.runtime.Memory;
import php.runtime.env.Environment;
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
}