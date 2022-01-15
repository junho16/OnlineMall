<template>
  <div class="category">

  </div>
</template>
<script>
export default {
  data () {
    return {

    }
  },
  created () {
    this.getMenus()
  },
  methods: {
    getMenus() {
      this.$http({
        url: this.$http.adornUrl("/product/category/list/tree"),
        method: "get"
      }).then(({ data }) => {
        console.log("成功获取到菜单数据...", data.data);
        this.menus = data.data;
      });
    },
  }
}
</script>
