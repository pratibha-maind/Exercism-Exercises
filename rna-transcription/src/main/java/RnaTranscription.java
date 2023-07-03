class RnaTranscription {

    String transcribe(String dnaStrand) {
        String dna = "ACGT";
        String rna = "UGCA";
        int n = dnaStrand.length();
        String ans="";
        for(int i=0; i<n; i++)
            {
                char a = dnaStrand.charAt(i);
                 int index = dna.indexOf(a);

                
                ans =ans+ rna.charAt(index);
            }
        return ans;
    }

}
