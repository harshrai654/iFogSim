package org.fog.test.perfeval;

import java.util.Map;

public class MyApplication {
    private Map<Integer, Map<String, Double>> deadlineInfo;
    private Map<Integer, Map<String, Integer>> additionalMipsInfo;
    public Map<Integer, Map<String, Integer>> getAdditionalMipsInfo() {
        return additionalMipsInfo;
    }
    public void setAdditionalMipsInfo(Map<Integer, Map<String, Integer>> additionalMipsInfo) {
        this.additionalMipsInfo = additionalMipsInfo;
    }
    public void setDeadlineInfo(Map<Integer, Map<String, Double>> deadlineInfo) {
        this.deadlineInfo = deadlineInfo;
    }
    public Map<Integer, Map<String, Double>> getDeadlineInfo() {
        return deadlineInfo;
    }

    public void addAppModule(String moduleName,int ram, int mips, long size, long bw){
        String vmm = "Xen";
        AppModule module = new AppModule(FogUtils.generateEntityId(), moduleName, appId, userId, mips, ram, bw, size, vmm, new TupleScheduler(mips, 1), new HashMap<Pair<String, String>, SelectivityModel>());
        getModules().add(module);
    }
}
