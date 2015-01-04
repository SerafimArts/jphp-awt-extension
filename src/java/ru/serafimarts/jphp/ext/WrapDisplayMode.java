package ru.serafimarts.jphp.ext;

import java.awt.*;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.LongMemory;
import php.runtime.reflection.ClassEntity;
import static php.runtime.annotation.Reflection.*;
import org.develnext.jphp.swing.classes.components.support.RootObject;


@Name(AwtExtension.NAMESPACE + "DisplayMode")
public class WrapDisplayMode extends RootObject {

    public final static int BIT_DEPTH_MULTI = DisplayMode.BIT_DEPTH_MULTI;
    public final static int REFRESH_RATE_UNKNOWN = DisplayMode.REFRESH_RATE_UNKNOWN;


    public WrapDisplayMode(Environment env) {
        super(env);
    }

    public WrapDisplayMode(Environment env, DisplayMode mode) {
        super(env);
        this.setDisplayMode(mode);
    }

    public WrapDisplayMode(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    public void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
    }

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    protected DisplayMode displayMode;



    @Signature({
            @Arg("width"),
            @Arg("height"),
            @Arg("bitDepth"),
            @Arg("refreshRate")
    })
    public Memory __construct(Environment env, Memory... args) {
        displayMode = new DisplayMode(args[0].toInteger(), args[1].toInteger(), args[2].toInteger(), args[3].toInteger());
        return Memory.NULL;
    }

    @Signature
    public Memory getWidth(Environment env, Memory... args) {
        return LongMemory.valueOf(displayMode.getWidth());
    }

    @Signature
    public Memory getHeight(Environment env, Memory... args) {
        return LongMemory.valueOf(displayMode.getHeight());
    }

    @Signature
    public Memory getBitDepth(Environment env, Memory... args) {
        return LongMemory.valueOf(displayMode.getBitDepth());
    }

    @Signature
    public Memory getRefreshRate(Environment env, Memory... args) {
        return LongMemory.valueOf(displayMode.getRefreshRate());
    }

    @Signature(@Arg(value = "displayMode", typeClass = AwtExtension.NAMESPACE + "DisplayMode"))
    public Memory equals(Environment env, Memory... args) {
        boolean result = displayMode.equals(args[0].toObject(WrapDisplayMode.class).getDisplayMode());
        return result ? Memory.TRUE : Memory.FALSE;
    }

    @Signature
    public Memory getHash(Environment env, Memory... args) {
        return LongMemory.valueOf(displayMode.hashCode());
    }
}