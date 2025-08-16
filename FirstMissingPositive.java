// 41. First Missing Positive
// https://leetcode.com/problems/first-missing-positive/description

class Solution {

    // Solusinya adalah kita mau mark semua elemen yang berada di dalam range dan
    // ada di array dan mark index yang berhubungan dengan nilai tersebut menjadi
    // negatif sebagai penanda bahwa nilai tersebut ada di dalam array
    public int firstMissingPositive(int[] nums) {
        // Pertama - tama kita mark dulu semua elemen yang udah negative atau 0 duluan
        // dengan nilai nums.length + 1, ini tidak akan merusak array, soalnya pas di
        // mark nanti kita cek apakah nilai tersebut melebihi index atau tidak, jadi
        // langsung di skip yang nums.length + 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }
        // Kedua kita lihat nilai pada nums[i], lalu kita absolute dulu (takutnya udah
        // di negatifin duluan), lalu kita lihat apakah nilai tersebut berada di dalam
        // array. Kalau iya, maka kita tandain index yang seharusnya menampung nilai
        // tersebut dengan negatif sebagai penanda bahwa nilai tersebut ada
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (index >= 0 && index < nums.length) {
                nums[index] = -Math.abs(nums[index]);
            }
        }
        // Ketiga, kita tinggal cari nilai positif pertama dengan melihat apakah nilai
        // pada index tersebut poisitf, jikalau iya, kita tinggal mengembalikan index +
        // 1 sebagai nilai
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}