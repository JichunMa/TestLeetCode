package number273;

public class Solution {

    public static void main(String[] args) {
        String result = new Solution().numberToWords(10000000);
        System.out.println(result);
    }

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        StringBuilder builder = new StringBuilder();
        int leftNum = num;
        int billion = num / 10000_00000;
        if (billion > 0) {
            builder.append(getEnglishForThree(billion) + " Billion");
            leftNum = num % 10000_00000;
        }

        int million = leftNum / 1000_000;
        if (million > 0) {
            builder.append(getEnglishForThree(million) + " Million");
            leftNum = num % 1000_000;
        }

        int thousand = leftNum / 1000;
        if (thousand > 0) {
            builder.append(getEnglishForThree(thousand) + " Thousand");
            leftNum = num % 1000;
        }
        builder.append(getEnglishForThree(leftNum));
        String result = builder.toString().trim();
        return result;
    }

    // 三位数的读法
    public String getEnglishForThree(int num) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tenWords = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] oneTenWords = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        int hundredNum;
        int tenNum;
        int singleNum;
        //当前剩余值
        int tmp = num;
        StringBuilder stringBuilder = new StringBuilder();
        if (num >= 100) {
            hundredNum = tmp / 100;
            stringBuilder.append(" ");
            stringBuilder.append(words[hundredNum]);
            stringBuilder.append(" Hundred");
        }
        tmp = num % 100;
        if (tmp >= 10) {
            tenNum = tmp / 10;
            singleNum = tmp % 10;
            if (tenNum == 1) {
                stringBuilder.append(" ");
                stringBuilder.append(oneTenWords[singleNum]);
                //个位处理了 可以提前结束了
                return stringBuilder.toString();
            } else {
                stringBuilder.append(" ");
                stringBuilder.append(tenWords[tenNum - 2]);
                singleNum = tmp % 10;
                if (singleNum == 0) {
                    //整十位个位处理了 可以提前结束了
                    return stringBuilder.toString();
                }
            }
        }
        singleNum = tmp % 10;

        if (singleNum != 0) {
            stringBuilder.append(" ");
            stringBuilder.append(words[singleNum]);
        }

        return stringBuilder.toString();
    }
}
