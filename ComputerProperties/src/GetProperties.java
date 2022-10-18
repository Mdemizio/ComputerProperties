import java.io.File;
class GetProperties {
 public static void main(String[] args) {
          String s;

          s = System.getProperty("os.name", "not specified");
          System.out.println("\n Your operating system is: " + s);
          s = System.getProperty("java.version", "not specified");
          System.out.println("\n Your Java version is: " + s);
          s = System.getProperty("user.home", "not specified");
          System.out.println("\n Your user home directory is: " + s);
          s = System.getProperty("java.home", "not specified");
          System.out.println("\n Your JRE installation directory is: " + s);
          s = System.getProperty("java.ext.dirs", "not specified");
          System.out.println("\n Your Java extension directories are: " + s);

          /* Total number of processors or cores available to the JVM */
          System.out.println("\n Available processors (cores): " +     
          Runtime.getRuntime().availableProcessors());

          /* Total amount of free memory available to the JVM */
          System.out.println("\n Free memory (bytes): " + 
          Runtime.getRuntime().freeMemory());

          /* This will return Long.MAX_VALUE if there is no preset limit */
          long maxMemory = Runtime.getRuntime().maxMemory();
          /* Maximum amount of memory the JVM will attempt to use */
          System.out.println("\n Maximum memory (bytes): " + 
          (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

          /* Total memory currently available to the JVM */
          System.out.println("\n Total memory available to JVM (bytes): " + Runtime.getRuntime().totalMemory());

          /* Get a list of all file system roots on this system */
          File[] roots = File.listRoots();

          /* For each file system root, print some info */
          for (File root : roots) {
                  System.out.println("\n File system root: " + root.getAbsolutePath());
                  System.out.println("\n Total space (bytes): " + root.getTotalSpace());
                  System.out.println("\n Free space (bytes): " + root.getFreeSpace());
                  System.out.println("\n Usable space (bytes): " + root.getUsableSpace());
          }
          
        System.getProperties().list(System.out);
  }
}

