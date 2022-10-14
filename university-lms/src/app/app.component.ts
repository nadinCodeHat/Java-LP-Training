import { Component, OnInit } from '@angular/core';
import { KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'lms-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  fullName: string = "";

  ngOnInit() {
    this.loadProfile().then(user => {
      console.log(user)
      this.fullName = user.firstName + ' ' + user.lastName
    })
  }

  constructor(private auth: KeycloakService) { }

  loadProfile(): Promise<any> {
    return new Promise<any>(async (resolve, reject) => {
      if (await this.auth.isLoggedIn()) {
        this.auth.loadUserProfile()
          .then(data => resolve(data))
          .catch(error => console.log(error))
      } else {
        console.log("User not logged in")
      }
    })
  }

  logout() {
    this.auth.logout()
  }
}
