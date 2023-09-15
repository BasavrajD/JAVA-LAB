import React from 'react'
import { registration,coldDrink,donor,checkup,smoothie } from '../assests/icons';
import './DonationProcess.css'
const DonationProcess = () => {
  return (
    <div className='process'>
      <h1 className="heading mx-auto py-4 px-2 mt-4">
        KEY FEATURES
      </h1>
      <div className="step-section flex mt-2 px-5">
        <div className="steps">
          <img src={registration} alt="" className="step-img-1" />
          <p className="step-desc">
            Resource Hub, where you can find your scholarships easily.
          </p>
        </div>
        <div className="steps">
          <img src={checkup} alt="" className="step-img-2" />
          <p className="step-desc">
            Personalized recommendations, where your get customized results.
          </p>
        </div>
        <div className="steps">
          <img src={donor} alt="" className="step-img-3" />
          <p className="step-desc">
            Application tracking, which streamlines the whole process.
          </p>
        </div>
        <div className="steps">
          <img src={coldDrink} alt="" className="step-img-4" />
          <p className="step-desc">
            Notification system, where you get easy updates about your application.
          </p>
        </div>
      </div>
    </div>
  );
}

export default DonationProcess;