package delta.monstarz.shared;

/**
 * Created by oliphaun on 2/3/17.
 */

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import delta.monstarz.shared.commands.BaseCommand;

public class SerDes {
    public static BaseCommand deserializeCommand(String json, String packagePrefix)
    {
        Gson gson = new Gson();
        JsonObject jsonObj = gson.fromJson(json, JsonObject.class);
        String commandname = jsonObj.get("name").getAsString();

        String classname = packagePrefix + commandname;

        BaseCommand basecmd = null;
        try {
            Class c = null;
            try {
                c = Class.forName(classname);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            basecmd = (BaseCommand)gson.fromJson(json, c);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return basecmd;
    }

    public static String serialize(Object c) {
        Gson gson = new Gson();
        return gson.toJson(c);
    }

    public static Args deserializeArgs(String json)
    {
        Gson gson = new Gson();
        return gson.fromJson(json, Args.class);
    }
}