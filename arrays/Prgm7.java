public class Prgm7{
	public static void main(String[] args){
		int[] arr = {12,34,12,45,67,34,65,45,54,89};
		int i = arr.length,h = 0;
		int[] count = new int[10];
		for(int k = arr.length-1 ; k >= 0; k--){
			int c1 = 0;
			for(int j = 0; j < arr.length-h-1 ; j++){
				if(arr[k] == arr[j]){
					c1 += 1;
				}
			}
			count[--i] = c1;
			h++;
		}
		for(i = 0; i < arr.length; i++){
			if(count[i] >= 1) 
				continue;
			else 
				System.out.print(arr[i]+" ");
		}
	}
}