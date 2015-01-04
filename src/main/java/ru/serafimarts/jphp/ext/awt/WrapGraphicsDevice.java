package ru.serafimarts.jphp.ext.awt;

import java.awt.*;

import org.develnext.jphp.swing.SwingExtension;
import org.develnext.jphp.swing.classes.components.UIForm;
import org.develnext.jphp.swing.support.JFrameX;
import php.runtime.Memory;
import php.runtime.lang.spl.exception.InvalidArgumentException;
import php.runtime.memory.*;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import static php.runtime.annotation.Reflection.*;
import org.develnext.jphp.swing.classes.components.support.RootObject;


@Name(AwtExtension.NAMESPACE + "GraphicsDevice")
public class WrapGraphicsDevice extends RootObject {
    public final static int TYPE_RASTER_SCREEN = GraphicsDevice.TYPE_RASTER_SCREEN;
    public final static int TYPE_PRINTER = GraphicsDevice.TYPE_PRINTER;
    public final static int TYPE_IMAGE_BUFFER = GraphicsDevice.TYPE_IMAGE_BUFFER;
    

    public WrapGraphicsDevice(Environment env) {
        super(env);
    }

    public WrapGraphicsDevice(Environment env, GraphicsDevice mode) {
        super(env);
        this.setGraphicsDevice(mode);
    }

    public WrapGraphicsDevice(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    public void setGraphicsDevice(GraphicsDevice graphicsDevice) {
        this.graphicsDevice = graphicsDevice;
    }

    public GraphicsDevice getGraphicsDevice() {
        return graphicsDevice;
    }

    protected GraphicsDevice graphicsDevice;




    @Signature
    public Memory isFullScreenSupported(Environment env, Memory... args) {
        return LongMemory.valueOf(graphicsDevice.isFullScreenSupported());
    }


    @Signature
    public Memory isDisplayChangeSupported(Environment env, Memory... args) {
        return LongMemory.valueOf(graphicsDevice.isDisplayChangeSupported());
    }


    @Signature
    public Memory getDisplayMode(Environment env, Memory... args) {
        WrapDisplayMode dm = new WrapDisplayMode(env);
        dm.setDisplayMode(graphicsDevice.getDisplayMode());
        return ObjectMemory.valueOf(dm);
    }


    @Signature(@Arg(value = "form", typeClass = SwingExtension.NAMESPACE + "UIForm"))
    public Memory setFullScreenWindow(Environment env, Memory... args) {
        Window window = args[0].toObject(UIForm.class).getWindow();
        this.graphicsDevice.setFullScreenWindow(window);
        return Memory.NULL;
    }

    @Signature(@Arg(value = "form", typeClass = AwtExtension.NAMESPACE + "DisplayMode"))
    public Memory setDisplayMode(Environment env, Memory... args) {
        DisplayMode mode = args[0].toObject(WrapDisplayMode.class).getDisplayMode();
        this.graphicsDevice.setDisplayMode(mode);
        return Memory.NULL;
    }

    @Signature
    public Memory getAvailableAcceleratedMemory(Environment env, Memory... args) {
        return LongMemory.valueOf(graphicsDevice.getAvailableAcceleratedMemory());
    }

}