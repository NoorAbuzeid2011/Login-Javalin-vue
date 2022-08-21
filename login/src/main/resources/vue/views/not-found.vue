<template id="not-found">
     <div id="app">
  <v-app >
    <v-main class="blue-grey lighten-5">
      <v-container fill-height="fill-height" >
        <v-layout align-center="align-center" justify-center="justify-center">
          <v-flex class="login-form text-xs-center"> 
            <v-alert
      class="white--text" color="pink lighten-1" 
     
      
      border="left" >
          <h1>Page not found (error 404)</h1>

    </v-alert>
           
           
          </v-flex>
        </v-layout>
      </v-container>
    </v-main>
    <v-footer app="app">
      <v-flex class="text-xs-center">© {{ new Date().getFullYear() }}. All rights reserved.</v-flex>
    </v-footer>
  </v-app>
</div>
</template>
<script>
    Vue.component("not-found", {template: "#not-found"});
</script>