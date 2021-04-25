<template>
  <div class="page">
    <div class="header">
      <div class="header-text">投研图表管理</div>
      <ul class="header-tab">
        <li class="active">行情图表</li>
        <!-- <li @click="gotoTabCompanyList">行情图表</li> -->
      </ul>
    </div>
    <div>
      <router-view />
    </div>
  </div>
</template>
