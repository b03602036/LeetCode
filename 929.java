//929. Unique Email Addresses


class Solution{
    public static int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();

        for(int i = 0 ; i < emails.length ; i++){
            for(int j = 0 ; j < emails[i].length() ; j++){
                if(emails[i].charAt(j) == '@') break;
                else if (emails[i].charAt(j) == '.'){
                    emails[i] = emails[i].replaceFirst("\\.", "");
                }
            }
            emails[i] = emails[i].replaceFirst("\\+.*@","@");
            seen.add(emails[i]);
        }

        for(int i = 0 ; i < emails.length ; i++)
        System.out.println(emails[i]);

        return seen.size();
    }
}
