import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http'
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ReactiveFormsModule } from '@angular/forms';
import { ProductsComponent } from './products/products.component';
import { NavigationComponent } from './navigation/navigation.component';
import { KitchenComponent } from './kitchen/kitchen.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { DecorComponent } from './decor/decor.component';
import { ServewareComponent } from './serveware/serveware.component';
import { GardenComponent } from './garden/garden.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    ProductsComponent,
    NavigationComponent,
    KitchenComponent,
    DecorComponent,
    ServewareComponent,
    GardenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  
})
export class AppModule { }
