<!-- 写html -->
<template>
  <div>
    <div>Bot昵称：{{ bot_name }}</div>
    <div>Bot战力：{{ bot_rating }}</div>
  </div>
</template>

<!-- 写js -->
<script>
import $ from 'jquery';
import { ref } from 'vue';

export default {
  name: "App",
  // 函数的入口
  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");
    
    // 访问后端链接
    $.ajax({
      url: "http://127.0.0.1:3000/pk/getbotinfo/",
      type: "get",
      success: resp => {
        console.log(resp)
        bot_name.value = resp.lisi;
        bot_rating.value = resp.zhangsan;
      }
    });

    return {
      bot_name,
      bot_rating
    }
  }
}
</script>

<!-- 写css -->
<style>
body {
  background-image: url("@/assets/school girl.jpg");
  background-size: cover;
}
</style>