/**
 *
 * @author moham
 */

import java.util.Random;

public class TestHashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTableLin x = new HashTableLin(5, 0.4);
        
        System.out.println("Linear Hashing:");
        System.out.println("------------------------------------");
        
        x.insert(20);
        x.insert(50);
        x.insert(60);
        x.insert(15);
        x.insert(5);
        x.insert(33);
        x.insert(90);
        x.insert(15);
        x.insert(100);
        x.insert(167);
        
        System.out.println("5 is in the table:");
        System.out.println(x.isIn(5));
        System.out.println("100 is in the table:");
        System.out.println(x.isIn(100));
        System.out.println("167 is in the table:");
        System.out.println(x.isIn(167));
        System.out.println("234 is in the table:");
        System.out.println(x.isIn(234));
        System.out.println("------------------------------------");
        
        x.printKeys();
        System.out.println("------------------------------------");
        
        x.printKeysAndIndexes();
        System.out.println("------------------------------------");
        
        System.out.println("x Number of Keys:");
        System.out.println(x.getNumOfKeys());
        System.out.println("------------------------------------");
        
        System.out.println("x Maximum Load of Hash Table:");
        System.out.println(x.getMaxLoad());
        System.out.println("------------------------------------");
        
        System.out.println("x Hash Table Size:");
        System.out.println(x.getTableSize());
        System.out.println("------------------------------------");
        
        System.out.println("x Hash Table Load Factor:");
        System.out.println(x.getLoadFactor());
        System.out.println("------------------------------------");
        
        
        System.out.println("done!");
        
        System.out.println();
        System.out.println();
        
        System.out.println("Quadratic Hashing");
        HashTableQuad y = new HashTableQuad(5, 0.4);
        
        y.insert(5);
        y.insert(18);
        y.insert(31);
        y.insert(44);
        y.insert(57);
        
        System.out.println("------------------------------------");
        
        System.out.println("5 is in the table:");
        System.out.println(y.isIn(5));
        System.out.println("18 is in the table:");
        System.out.println(y.isIn(18));
        System.out.println("31 is in the table:");
        System.out.println(y.isIn(31));
        System.out.println("44 is in the table:");
        System.out.println(y.isIn(44));
        System.out.println("57 is in the table:");
        System.out.println(y.isIn(57));
        System.out.println("6 is in the table:");
        System.out.println(y.isIn(6));
        
        System.out.println("------------------------------------");
        
        System.out.println("Keys in the table:");
        y.printKeys();
        System.out.println("------------------------------------");
        
        y.printKeysAndIndexes();
        System.out.println("------------------------------------");
        
        System.out.println("y Number of Keys:");
        System.out.println(y.getNumOfKeys());
        System.out.println("------------------------------------");
        
        System.out.println("y Maximum Load of Hash Table:");
        System.out.println(y.getMaxLoad());
        System.out.println("------------------------------------");
        
        System.out.println("y Hash Table Size:");
        System.out.println(y.getTableSize());
        System.out.println("------------------------------------");
        
        System.out.println("y Hash Table Load Factor:");
        System.out.println(y.getLoadFactor());
        System.out.println("------------------------------------");
        
        System.out.println();
        
        HashTableQuad z = new HashTableQuad(3, 0.7);
        z.insert(5);
        z.insert(18);
        z.insert(31);
        z.insert(44);
        z.insert(57);
        z.insert(21);
        z.insert(21);
        z.insert(52);
        
        System.out.println("------------------------------------");
        
        System.out.println("5 is in the table:");
        System.out.println(z.isIn(5));
        System.out.println("18 is in the table:");
        System.out.println(z.isIn(18));
        System.out.println("31 is in the table:");
        System.out.println(z.isIn(31));
        System.out.println("44 is in the table:");
        System.out.println(z.isIn(44));
        System.out.println("57 is in the table:");
        System.out.println(z.isIn(57));
        System.out.println("21 is in the table:");
        System.out.println(z.isIn(21));
        System.out.println("52 is in the table:");
        System.out.println(z.isIn(52));
        System.out.println("6 is in the table:");
        System.out.println(z.isIn(6));
        
        System.out.println("------------------------------------");
        
        System.out.println("Keys in the table:");
        z.printKeys();
        System.out.println("------------------------------------");
        
        z.printKeysAndIndexes();
        System.out.println("------------------------------------");
        
        
        System.out.println("z Number of Keys:");
        System.out.println(z.getNumOfKeys());
        System.out.println("------------------------------------");
        
        System.out.println("z Maximum Load of Hash Table:");
        System.out.println(z.getMaxLoad());
        System.out.println("------------------------------------");
        
        System.out.println("z Hash Table Size:");
        System.out.println(z.getTableSize());
        System.out.println("------------------------------------");
        
        System.out.println("z Hash Table Load Factor:");
        System.out.println(z.getLoadFactor());
        System.out.println("------------------------------------");
        
        
        System.out.println("done!");
        
        
        //avg linear probing test
        System.out.println(avgProbesLinear());
    }
    
    static double avgProbesLinear(){
        double avgForOne=0, avgForTwo=0, avgForThree=0, avgForFour=0, avgForFive=0, avgForSix=0, avgForSeven=0, avgForEight=0, avgForNine=0;
        Random rand = new Random();
        
        HashTableLin testTable;
        
        //we don't need this
//        HashTableLin twoTestFactor;// = new HashTableLin(100000, 0.2);
//        HashTableLin threeTestFactor;// = new HashTableLin(100000, 0.3);
//        HashTableLin fourTestFactor;// = new HashTableLin(100000, 0.4);
//        HashTableLin fiveTestFactor;// = new HashTableLin(100000, 0.5);
//        HashTableLin sixTestFactor;// = new HashTableLin(100000, 0.6);
//        HashTableLin sevenTestFactor;// = new HashTableLin(100000, 0.7);
//        HashTableLin eightTestFactor;// = new HashTableLin(100000, 0.8);
//        HashTableLin nineTestFactor;// = new HashTableLin(100000, 0.9);
        
        //0.1
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.1);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForOne += testTable.probeCount;
        }
        avgForOne = avgForOne / (100*100000);
        
        
        //0.2
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.2);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForTwo += testTable.probeCount;
        }
        avgForTwo = avgForTwo / (100*100000);
        
        
        //0.3
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.3);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForThree += testTable.probeCount;
        }
        avgForThree = avgForThree / (100*100000);
        
        
        //0.4
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.4);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForFour += testTable.probeCount;
        }
        avgForFour = avgForFour / (100*100000);
        
        
        //0.5
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.5);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForFive += testTable.probeCount;
        }
        avgForFive = avgForFive / (100*100000);
        
        
        //0.6
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.6);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForSix += testTable.probeCount;
        }
        avgForSix = avgForSix / (100*100000);
        
        
        //0.7
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.7);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForSeven += testTable.probeCount;
        }
        avgForSeven = avgForSeven / (100*100000);
        
        
        //0.8
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.8);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForEight += testTable.probeCount;
        }
        avgForEight = avgForEight / (100*100000);
        
        
        //0.9
        for(int i=0; i<100; i++){
            testTable = new HashTableLin(100000, 0.9);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForNine += testTable.probeCount;
        }
        avgForNine = avgForNine / (100*100000);
        
        System.out.println("0.1: " + avgForOne + "; 0.2: " + avgForTwo + "; 0.3: " + avgForThree + "; 0.4: " + avgForFour + "; 0.5: " + avgForFive + "; 0.6: " + avgForSix + "; 0.7: " + avgForSeven + "; 0.8: " + avgForEight + "; 0.9: " + avgForNine);
        return (avgForOne + avgForTwo + avgForThree + avgForFour + avgForFive + avgForSix + avgForSeven + avgForEight + avgForNine)/9;
    }
    
    static double avgProbesQuadratic(){
        double avgForOne=0, avgForTwo=0, avgForThree=0, avgForFour=0, avgForFive=0, avgForSix=0, avgForSeven=0, avgForEight=0, avgForNine=0;
        Random rand = new Random();
        
        HashTableQuad testTable;
        
        //0.1
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.1);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForOne += testTable.probeCount;
        }
        avgForOne = avgForOne / (100*100000);
        
        
        //0.2
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.2);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForTwo += testTable.probeCount;
        }
        avgForTwo = avgForTwo / (100*100000);
        
        
        //0.3
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.3);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForThree += testTable.probeCount;
        }
        avgForThree = avgForThree / (100*100000);
        
        
        //0.4
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.4);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForFour += testTable.probeCount;
        }
        avgForFour = avgForFour / (100*100000);
        
        
        //0.5
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.5);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForFive += testTable.probeCount;
        }
        avgForFive = avgForFive / (100*100000);
        
        
        //0.6
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.6);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForSix += testTable.probeCount;
        }
        avgForSix = avgForSix / (100*100000);
        
        
        //0.7
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.7);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForSeven += testTable.probeCount;
        }
        avgForSeven = avgForSeven / (100*100000);
        
        
        //0.8
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.8);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForEight += testTable.probeCount;
        }
        avgForEight = avgForEight / (100*100000);
        
        
        //0.9
        for(int i=0; i<100; i++){
            testTable = new HashTableQuad(100000, 0.9);
            for(int j=0; j<100000; j++){
                testTable.insert(rand.nextInt(2147483647));
            }
            avgForNine += testTable.probeCount;
        }
        avgForNine = avgForNine / (100*100000);
        
        System.out.println("0.1: " + avgForOne + "; 0.2: " + avgForTwo + "; 0.3: " + avgForThree + "; 0.4: " + avgForFour + "; 0.5: " + avgForFive + "; 0.6: " + avgForSix + "; 0.7: " + avgForSeven + "; 0.8: " + avgForEight + "; 0.9: " + avgForNine);
        return (avgForOne + avgForTwo + avgForThree + avgForFour + avgForFive + avgForSix + avgForSeven + avgForEight + avgForNine)/9;
    }
    
}
