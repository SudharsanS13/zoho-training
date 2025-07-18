class Numbersort{
public static void main(String[] args){
	int[] arr = {878,235,234,2,345,4,476,234,23,222};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE){
            System.out.println(" This Array didn't have third largest element )");
	}
        else{
            System.out.println("Third largest element: " + third);
	}
	}
}


        	
