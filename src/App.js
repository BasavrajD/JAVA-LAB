
import './App.css';
import Navbar from './Components/Navbar';
import About from './Pages/About';
import Home from './Pages/Home';
import ContactUs from './Pages/ContactUs';
import Footer from "./Components/Footer";

import {Routes,Route,BrowserRouter as Router} from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<ContactUs/>} />
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
