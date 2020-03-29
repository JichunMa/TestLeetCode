package number974;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"};
        String[] result = solution.reorderLogFiles(logs);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> numberList = new ArrayList<>();
        ArrayList<String> letterList = new ArrayList<>();
        String item;
        for (int i = 0; i < logs.length; i++) {
            item = logs[i];
            if (isNumberLog(item)) {
                numberList.add(item);
            } else {
                String content = getContent(item);
                int theSameIndex = getAllContent(letterList).indexOf(content);
                if (theSameIndex >= 0) {
                    //具有相同的
                    String tag = getTag(item);
                    if (tag.compareTo(getTag(letterList.get(theSameIndex))) < 0) {
                        if (theSameIndex == 0) {
                            letterList.add(0, item);
                        } else {
                            letterList.add(theSameIndex, item);
                        }
                    } else {
                        int nextSameIndex = theSameIndex + 1;
                        if (nextSameIndex == letterList.size()) {
                            letterList.add(item);
                        } else {
                            String nextContent = getContent(letterList.get(nextSameIndex));
                            while (nextSameIndex != letterList.size() && nextContent.equals(content)) {
                                if (tag.compareTo(getTag(letterList.get(nextSameIndex))) > 0) {
                                    nextSameIndex++;
                                } else {
                                    break;
                                }
                            }
                            if (nextSameIndex == letterList.size()) {
                                letterList.add(item);
                            } else {
                                letterList.add(nextSameIndex, item);
                            }
                        }
                    }
                } else {
                    //不相同的
                    if (letterList.size() == 0) {
                        letterList.add(item);
                    } else {
                        boolean isAdded = false;
                        for (int j = 0; j < letterList.size(); j++) {
                            if (content.compareTo(getContent(letterList.get(j))) < 0) {
                                if (j == 0) {
                                    isAdded = true;
                                    letterList.add(0, item);
                                } else {
                                    isAdded = true;
                                    letterList.add(j, item);
                                }
                                break;
                            }
                        }
                        if (!isAdded) {
                            letterList.add(item);
                        }
                    }
                }
            }
        }

        ArrayList<String> result = new ArrayList<>();
        result.addAll(letterList);
        result.addAll(numberList);

        String[] array = new String[logs.length];

        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }

        return array;
    }

    private ArrayList<String> getAllContent(ArrayList<String> letterList) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < letterList.size(); i++) {
            strings.add(getContent(letterList.get(i)));
        }
        return strings;
    }

    public String getTag(String log) {
        int blankIndex = log.indexOf(" ");
        return log.substring(0, blankIndex);
    }

    public String getContent(String log) {
        int blankIndex = log.indexOf(" ");
        //跳过空格
        blankIndex++;
        return log.substring(blankIndex);
    }

    //判断首位是数字
    public boolean isNumberLog(String log) {
        char firstChar = getContent(log).charAt(0);
        return firstChar >= 48 && firstChar <= 57;
    }
}
