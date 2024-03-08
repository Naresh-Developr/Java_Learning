public class stringm {
    public static void main(String[] args) {
        
        String name = "Test";

        System.out.println(name.substring(0,name.length()));
        System.out.println(name.compareTo("test"));
        System.out.println(name.equals("Test"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('T'));
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); // remove empty space from beginning and end
        System.out.println(name.replace('T', 'B'));
        

    }
    
}
