package hw8;

/** Class InterpolationSearcher **/
public class InterpolationSearcher {
	/** interpolationSearcher constructor **/
	public void interpolationSearcher()	{}
	
	/** search function **/
	public int search(int[] sortedArray, int toFind) {
		int low = 0;
		int high = sortedArray.length - 1;
		int mid;
		while (sortedArray[high] != sortedArray[low] &&
				sortedArray[low] <= toFind && sortedArray[high] >= toFind) {
			/** out of range is possible here **/
			mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);
			if (sortedArray[mid] < toFind)
				low = mid + 1;
			else if (sortedArray[mid] > toFind)
				high = mid - 1;
			else
				return mid;
		}
		if (sortedArray[low] == toFind)
			return low;
		/** not found **/
		else
			return -1;
	}
}
