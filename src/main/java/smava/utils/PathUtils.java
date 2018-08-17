package smava.utils;

import java.io.File;

import static java.lang.System.getProperty;

public class PathUtils {
   public static String pathSeparator = File.separator;


   private static String getPathToProject(){
       return getProperty("user.dir");
   }

   private static String getPathToTestFolder(){
      return new StringBuilder(getPathToProject())
               .append(pathSeparator)
               .append("src")
               .append(pathSeparator)
               .append("test").toString();

   }

   public static String getPathToResources(){
       return new StringBuilder(getPathToTestFolder())
               .append(pathSeparator)
               .append("resources")
               .append(pathSeparator).toString();
   }

   public static String getPathToBrowsers(){
       return new StringBuilder(getPathToResources())
               .append("browsers")
               .append(pathSeparator).toString();
   }
}
