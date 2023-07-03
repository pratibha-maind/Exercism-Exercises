class ResistorColor {
    int colorCode(String color) {
        int ans=0;
        switch(color)
            {
                case "black":
                    ans=0;
                    break;
                case "brown":
                    ans=1;
                    break;
                case "red":
                    ans=2;
                    break;
                case "orange":
                    ans=3;
                    break;
                case "yellow":
                    ans=4;
                    break;
                case "green":
                    ans=5;
                    break;
                case "blue":
                    ans=6;
                    break;
                case "violet":
                    ans=7;
                    break;
                case "grey":
                    ans=8;
                    break;
                case "white":
                    ans=9;
                    break;
                
            }
        return ans;
    }

    String[] colors() {
        String[] colorsName = {"black", "brown","red","orange","yellow", "green","blue","violet","grey","white"};
        return colorsName;
    }
}
