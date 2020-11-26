class Solution {
    public String destCity(List<List<String>> path){
        HashSet<String> pre = new HashSet<>();
        HashSet<String> post = new HashSet<>();
        for(int i = 0; i < path.size(); i++){
                post.add(path.get(i).get(1));
                pre.add(path.get(i).get(0));
        }
        HashSet<String> p = new HashSet<>();
        for(String s : post){
            if(pre.contains(s)){
                p.add(s);
            }
        }
        for(String s : p){
            post.remove(s);
        }
        Iterator<String> itr = post.iterator();
        return itr.next();
    }
}

-----------------------------------------------------------------------------------------------------------------------