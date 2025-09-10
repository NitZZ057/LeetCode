class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        HashSet<Integer> set;
        HashSet<Integer> users = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int[] friendship: friendships){
            //set = new HashSet<>(Arrays.asList(languages[friendship[0]]));
            set = Arrays.stream(languages[friendship[0]-1])
                                                .boxed()
                                                .collect(Collectors.toCollection(HashSet::new));
            boolean canComunicate = false;

            for(int l: languages[friendship[1]-1]){
                if(set.contains(l)){
                    canComunicate = true;
                    break;
                }
            }

            if(!canComunicate){
                users.add(friendship[0]);
                users.add(friendship[1]);
            }
        }

        for(int u: users){
            for(int l: languages[u-1]){
                map.put(l,map.getOrDefault(l,0)+1);
            }
        }

        int maxCount = 0;

        for(HashMap.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() >= maxCount){
                maxCount = entry.getValue();
            }
        }

        return users.size() - maxCount;
    }
}