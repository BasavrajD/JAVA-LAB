import React from 'react'
import { bloodBag } from '../assests/icons'
import './BloodReq.css'
const BloodReq = () => {
  return (
    <div className="mt-4">
      <div>
        <img src={bloodBag} alt="" className="bloodBag" />
        <img src={bloodBag} alt="" className="bloodBag" />
        <img src={bloodBag} alt="" className="bloodBag" />
        <img src={bloodBag} alt="" className="bloodBag" />
      </div>
      <div className="px-5 mt-3">
        Every two seconds, someone in India needs blood, which means more than
        32800 blood donations are needed per day as per National Blood
        Transfusion Council (NBTC).Any healthy adult, both male and female, can
        donate blood. Men can donate safely once in every three months while
        women can donate every four months.
      </div>
    </div>
  );
}

export default BloodReq