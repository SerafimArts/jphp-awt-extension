package ru.serafimarts.jphp.ext.classes;


import org.develnext.jphp.swing.classes.WrapFont;
import php.runtime.Memory;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import php.runtime.env.Environment;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
import ru.serafimarts.jphp.ext.AwtExtension;
import org.develnext.jphp.swing.SwingExtension;
import static php.runtime.annotation.Reflection.*;
import org.develnext.jphp.swing.classes.WrapGraphics;
import org.develnext.jphp.swing.classes.components.support.RootObject;


@Name(AwtExtension.NAMESPACE + "Graphics2D")
public class WrapGraphics2D extends RootObject {

    public WrapGraphics2D(Environment env) {
        super(env);
    }

    public WrapGraphics2D(Environment env, Graphics2D graphics2D) {
        super(env);
        this.setDisplayMode(graphics2D);
    }
    public WrapGraphics2D(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public void setDisplayMode(Graphics2D graphics2D) {
        this.graphics2D = graphics2D;
    }

    public Graphics2D getDisplayMode() {
        return graphics2D;
    }

    protected Graphics2D graphics2D;



    @Signature({
        @Arg(value = "graphics", typeClass = SwingExtension.NAMESPACE + "Graphics")
    })
    public Memory __construct(Environment env, Memory... args) {
        if (!args[0].toBoolean()) {
            throw new RuntimeException("Graphics must be initialise after set form visibility to \"true\"");
        }

        WrapGraphics g = args[0].toObject(WrapGraphics.class);

        this.graphics2D = (Graphics2D)g.getGraphics();
        return Memory.NULL;
    }


    @Signature({
        @Arg("string"),
        @Arg("x"),
        @Arg("y")
    })
    public Memory drawString(Environment env, Memory... args) {
        this.graphics2D.drawString(args[0].toString(), args[1].toInteger(), args[2].toInteger());
        return Memory.NULL;
    }


    @Signature({
        @Arg(value = "font", typeClass = SwingExtension.NAMESPACE + "Font")
    })
    public Memory setFont(Environment env, Memory... args) {
        this.graphics2D.setFont(args[0].toObject(WrapFont.class).getFont());
        return Memory.NULL;
    }

    @Signature({
        @Arg(value = "font", typeClass = SwingExtension.NAMESPACE + "Font")
    })
    public Memory getFont(Environment env, Memory... args) {
        return new ObjectMemory(new WrapFont(env, this.graphics2D.getFont()));
    }
    

    @Signature({
        @Arg("x1"),
        @Arg("y1"),
        @Arg("x2"),
        @Arg("y2")
    })
    public Memory drawLine(Environment env, Memory... args) {
        this.graphics2D.drawLine(
            args[0].toInteger(),
            args[1].toInteger(),
            args[2].toInteger(),
            args[3].toInteger()
        );

        return Memory.NULL;
    }


    @Signature({
        @Arg("key"),
        @Arg("value")
    })
    public Memory setRenderingHint(Environment env, Memory... args) {
        Key key         = WrapRenderingHints.getOriginalKey(args[0].toInteger());
        Object value    = WrapRenderingHints.getOriginalValue(args[1].toInteger());

        this.graphics2D.setRenderingHint(key, value);

        return Memory.NULL;
    }
}