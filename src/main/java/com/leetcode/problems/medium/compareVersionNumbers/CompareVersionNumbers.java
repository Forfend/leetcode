package com.leetcode.problems.medium.compareVersionNumbers;

public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("\\.");
        String[] versions2 = version2.split("\\.");

        int maxLength = Math.max(versions1.length, versions2.length);

        for (int i = 0; i < maxLength; i++) {
            int val1 = i < versions1.length ? Integer.valueOf(versions1[i]) : 0;
            int val2 = i < versions2.length ? Integer.valueOf(versions2[i]) : 0;

            if (val1 < val2) {
                return -1;
            } else if (val1 > val2) {
                return 1;
            }
        }

        return 0;
    }
}
