package ru.serafimarts.jphp.ext;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;
import ru.serafimarts.jphp.ext.classes.WrapDisplayMode;
import ru.serafimarts.jphp.ext.classes.WrapGraphicsDevice;
import ru.serafimarts.jphp.ext.classes.WrapGraphicsEnvironment;

public class AwtExtension extends Extension {
    public final static String NAMESPACE = "php\\awt\\";

    @Override
    public String getName() {
        return "AwtExtension";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }


    @Override
    public void onRegister(CompileScope scope) {
        this.registerClass(scope, WrapDisplayMode.class);
        this.registerClass(scope, WrapGraphicsEnvironment.class);
        this.registerClass(scope, WrapGraphicsDevice.class);
    }
}
