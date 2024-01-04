class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int i=0,c=0;
        for(i=0;i<derived.length;i++)
        {
            c^=derived[i];
        }
        return c==0;

    }
}
