/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawozdanie.models;

/**
 *
 * @author bohda
 */
public class DaneModel {
    private DaneWstępneModel DWM = new DaneWstępneModel();
    private DaneTBUModel DaneTBU = new DaneTBUModel();
    private DaneWDZModel DaneWDZ = new DaneWDZModel();
    private DaneCHAModel DaneCHA = new DaneCHAModel();
    private DaneWSWAModel DaneWSWA = new DaneWSWAModel();
    private DaneWModel DaneW = new DaneWModel();
    
    public void setDaneTBU(DaneTBUModel DaneTBU) {
        this.DaneTBU = DaneTBU;
    }
    public void setDaneWDZ(DaneWDZModel DaneWDZ) {
        this.DaneWDZ = DaneWDZ;
    }
    public void setDaneCHA(DaneCHAModel DaneCHA) {
        this.DaneCHA = DaneCHA;
    }
    public void setDaneWSWA(DaneWSWAModel DaneWSWA) {
        this.DaneWSWA = DaneWSWA;
    }
    public void setDaneWModel(DaneWModel DaneW) {
        this.DaneW = DaneW;
    }
    
    
    public DaneWSWAModel getDaneWSWA() {
        return DaneWSWA;
    }
    public DaneCHAModel getDaneCHA() {
        return DaneCHA;
    }
    public DaneWDZModel getDaneWDZ() {
        return DaneWDZ;
    }
    public DaneTBUModel getDaneTBU() {
        return DaneTBU;
    }
    public DaneWModel getDaneWModel() {
        return DaneW;
    }
}
