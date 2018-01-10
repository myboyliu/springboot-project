package com.huatuo.customer.base.enums;

public enum OrgScale {
	YJ(1, "一级甲等"), YY(2, "一级乙等"), YB(3, "一级丙等"),
	EJ(4, "二级甲等"), EY(5, "二级乙等"), EB(6, "二级丙等"),
	SJ(7, "三级甲等"), SY(8, "三级乙等"), SB(9, "三级丙等"), ST(10, "三级特等");
	
	private int index;
	private String name;
	
	// 构造方法
		private OrgScale(int index, String name) {
			this.index = index;
			this.name = name;
		}
		
		// 普通方法
	    public static String getName(int index) {
	        for (OrgScale c : OrgScale.values()) {
	            if (c.getIndex() == index) {
	                return c.name;
	            }
	        }
	        return null;
	    }

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
