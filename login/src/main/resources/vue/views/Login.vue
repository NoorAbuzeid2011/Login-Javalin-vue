
<template id="login">
 <div id="app">
  <v-app >
    <v-main class="blue-grey lighten-5">
      <v-container fill-height="fill-height" >
        <v-layout align-center="align-center" justify-center="justify-center">
          <v-flex class="login-form text-xs-center"> 
           
            <v-card light="light">
              <v-card-text>
                <div class="subheading">
                  <template  v-if="options.isLoggingIn">Log in to your portal</template>
                  <template v-else="v-else">Crate a new account</template>
                </div>
                <v-form>
                  <v-text-field v-if="!options.isLoggingIn" v-model="user.name" light="light"  label="Name"></v-text-field>
                  <v-text-field  v-model="user.email" light="light"  label="Email" type="email"></v-text-field>
                  <v-text-field v-model="user.password" light="light"  label="Password" type="password"></v-text-field>
                  <v-btn  v-if="options.isLoggingIn" @click.prevent=""  class="white--text" color="pink lighten-1"  block="block" type="submit">Sign in</v-btn>
                  <v-btn class="white--text" color="pink lighten-1"  v-else="v-else" block="block" type="submit" @click.prevent="options.isLoggingIn = true">Sign up</v-btn>
             
                   <div class="pt-3  font-weight-medium"  v-if="options.isLoggingIn">Don't have an account?
              <v-btn color="pink lighten-1"   plain light="light" @click="options.isLoggingIn = false">Sign up</v-btn>
            </div>
                </v-form>
              </v-card-text>
                
            </v-card>
           
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
    Vue.component("login",
 {
template: "#login",
   data: () => ({
    user: {
      // email: 'noor.abuzeid@example.com',
      // password: 'admin',
      // name: 'Nour abuzeid',
    },
    options: {
      isLoggingIn: true,
      shouldStayLoggedIn: true
    },
  }),

});
</script>
<style>
  .login-form{
  max-width: 500px}
</style>
