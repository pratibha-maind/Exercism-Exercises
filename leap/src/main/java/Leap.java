class Leap {

    boolean isLeapYear(int year) {
        boolean ans = false;
        int flg =0;
        if((year % 100 ==0))
        {
            flg=0;
            if (year % 400 == 0)
                ans= true;
            else
                flg=1;
        }
            
        else if((year % 4 ==0) && flg==0)
            ans = true;
        else
            ans = false;
        return ans;
    }

}
