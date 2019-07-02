package questions

import (
	"sort"
	"fmt"
)

func merge(nums1 []int, m int, nums2 []int, n int)  {
    nums1 = append(nums1, nums2...)
    sort.Ints(nums1[:m+n])
}


func main() {
	nums1 := make([]int, 3, 6)
	nums2 := make([]int, 3, 3)
	nums1[0], nums1[1], nums1[2] = 1,2,3
	nums2[0], nums2[1], nums2[2] = 2,5,6
	merge(nums1, 3, nums2, 3)
	fmt.Println(nums1[:6])
}