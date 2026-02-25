import { Routes } from '@angular/router';
import { Home } from './home/home';
import { About } from './about/about';
import { Contact } from './contact/contact';
import { NotFound } from './not-found/not-found';
import { User } from './user/user';

export const routes: Routes = [

    { path: '', redirectTo: '/home', pathMatch: 'full' },

    { path: 'home', component: Home },
    {path: 'about', component: About},
    {path: 'contact', component: Contact},
    {path: 'user', component: User},
    {path: '**', component: NotFound},
    
];
