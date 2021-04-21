package myApp;

public class subclass {

    int[] myArr = new int[4];

    int indexs = 0;

    String insert(int value){
        String returnString = "value is added to array";

        if (indexs < myArr.length){
            myArr[indexs++] = value;
        }else {
            returnString ="array is out of range";
        }

        return returnString;
    }

    void travarse (){

        System.out.println("!!--------------------------------!!");

        for (int x = 0; x<indexs; x++){
            System.out.println(myArr[x]);

        }

    }

    String linerSearch(int value){
        String returnValue = -1 +" value not found";

        for (int y = 0; y<indexs; y++){

            if (myArr[y]  == value) {
                returnValue = value + " is on index " + y;
                break;
            }
        }

       return returnValue;
    }
    void delete(int index){
        for (int z = index; z<this.indexs; z++){
            if (index==this.indexs-1){
                myArr[z] = -0;

                break;

            }else if (z==index){
                myArr[z] = myArr[z+1];
            }else if (z < this.indexs-1){
                myArr[z] = myArr[z+1];

            }
        }
        this.indexs--;
    }

    String update(int index , int newValue ){
        String returnUpdate = "sorry couldn't find the value to update";
        for (int r = index; r<this.indexs;r++){
            if (r==index){
                myArr[r] = newValue;
                returnUpdate ="your value been updated";
                break;
            }
        }
        return returnUpdate;
    }

    String binarySearch(int value){
        String binaryReturn = -1 +" sorry couldn't find the value";

        int lowerBond=0;
        int higherBound= myArr.length-1;
        boolean isFound = true;

        while (isFound){
            int mid = lowerBond +( (higherBound - lowerBond)/2);
            if (higherBound<lowerBond){
                break;
            }
            if (myArr[mid] == value){
                binaryReturn = value + " is-- on the index " + mid;
                isFound = false;
                break;
            } else if (myArr[mid] < value){
                lowerBond=mid + 1;
            }else  if (myArr[mid] > value){
                 higherBound = mid -1;
            }

        }

        return binaryReturn;
    }

}
