import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardComponent } from './Components/card/card.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { NavigationComponent } from './navigation/navigation.component'
import { KitchenComponent } from './kitchen/kitchen.component';
import { DecorComponent } from './decor/decor.component';
import { ServewareComponent } from './serveware/serveware.component';
import { GardenComponent } from './garden/garden.component';

const routes: Routes = [
  {path:'',redirectTo:'kitchen',pathMatch:'full'},
  {path:'login',component: LoginComponent},
  {path:'signup',component: SignUpComponent},
  {path:'product',component:NavigationComponent},
  {path:'kitchen',component:KitchenComponent},
  {path:'decor',component:DecorComponent},
  {path:'serveware',component:ServewareComponent},
  {path:'garden',component:GardenComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[LoginComponent,SignUpComponent,CardComponent,NavigationComponent,KitchenComponent,DecorComponent,ServewareComponent,GardenComponent]