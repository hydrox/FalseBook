package com.bukkit.gemo.FalseBook.IC.ICs.standard;

import com.bukkit.gemo.FalseBook.IC.ICs.ExternalICPackage;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1000;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1001;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1017;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1018;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1020;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1025;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1030;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC1050;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC2020;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3000;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3001;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3002;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3003;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3020;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3021;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3030;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3031;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3032;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3033;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3034;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3036;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3040;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC3101;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC4000;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC4010;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC4100;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC4110;
import com.bukkit.gemo.FalseBook.IC.ICs.standard.MC4200;

public class StandardPackage extends ExternalICPackage {

   public StandardPackage() {
      this.setAPI_VERSION("1.1");
      this.setShowImportMessages(false);
      this.addIC(MC1000.class);
      this.addIC(MC1001.class);
      this.addIC(MC1017.class);
      this.addIC(MC1018.class);
      this.addIC(MC1020.class);
      this.addIC(MC1025.class);
      this.addIC(MC1030.class);
      this.addIC(MC1050.class);
      this.addIC(MC2020.class);
      this.addIC(MC3000.class);
      this.addIC(MC3001.class);
      this.addIC(MC3002.class);
      this.addIC(MC3003.class);
      this.addIC(MC3020.class);
      this.addIC(MC3021.class);
      this.addIC(MC3030.class);
      this.addIC(MC3031.class);
      this.addIC(MC3032.class);
      this.addIC(MC3033.class);
      this.addIC(MC3034.class);
      this.addIC(MC3036.class);
      this.addIC(MC3040.class);
      this.addIC(MC3101.class);
      this.addIC(MC4000.class);
      this.addIC(MC4010.class);
      this.addIC(MC4100.class);
      this.addIC(MC4110.class);
      this.addIC(MC4200.class);
   }
}
