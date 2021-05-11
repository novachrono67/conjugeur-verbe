//package controllers;
//
//import java.rmi.Naming;
//
//public class ConnectToServeur {
//    public static ConjugaisonInterface conjugaisonInterface;
//
//    public static ConjugaisonInterface magasin() {
//        try{
//            conjugaisonInterface = (ConjugaisonInterface) Naming.lookup("rmi://localhost:1249/conjugaison");
//        }
//        catch (Exception e)
//        {
//            System.out.println ("conjugaison exception: " + e);
//        }
//        return conjugaisonInterface;
//    }
//
//}
