import BloodReq from "../Components/BloodReq";
import DonationProcess from "../Components/DonationProcess";

import Hero from "../Components/Hero";
import LearnAboutDonation from "../Components/LearnAboutDonation";
import Transfusion from "../Components/Transfusion";


import React from 'react'

const Home = () => {
  return (
    <div>
      <Hero />
      <LearnAboutDonation />

      <Transfusion />
      
    </div>
  );
}

export default Home