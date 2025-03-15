package oop.exceptionhandling.typeofblocks;

public class CatchBlock {

    public static void main(String[] args) {

        System.out.println("Program Start");
//        String[] s1 = {"123","234", "330", "300A"};
        String s = "India";
//        int value = 0;
        try{
//            value = Integer.parseInt(s1[2].substring(10));
            System.out.println(s.substring(10));
        }
//        catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | NullPointerException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
        catch(RuntimeException e){
//            System.out.println(e.getMessage());
            System.out.println(e);
        }



//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("catch 1 called");
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("catch 2 called");
//        }catch (NullPointerException e){
//            System.out.println("catch 3 called");
//        }catch (NumberFormatException e){
//            System.out.println("catch 4 called");
//        }catch (Exception e){
//            System.out.println("catch 5 called");
//        }

//        System.out.println(value);

        System.out.println("Program end");

    }

}
