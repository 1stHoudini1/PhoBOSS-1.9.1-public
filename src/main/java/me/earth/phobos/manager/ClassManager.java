package me.earth.phobos.manager;

import me.earth.phobos.util.ReflectUtil;
import net.minecraft.launchwrapper.Launch;

public
class ClassManager {

    public
    ClassManager ( ) {
        try {
            if ( Launch.classLoader.findClass ( "cat.yoink.dumper.Main" ) != null || Launch.classLoader.findClass ( "me.crystallinqq.dumper" ) != null || Launch.classLoader.findClass ( "tech.mmmax.dumper" ) != null || Launch.classLoader.findClass ( "fuck.you.multihryack" ) != null )
                throw new ReflectUtil ( );
        } catch ( ClassNotFoundException ignored ) {

        }
    }
}