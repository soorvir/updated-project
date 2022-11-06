import React from 'react';
import { Fade } from 'react-slideshow-image';
import 'react-slideshow-image/dist/styles.css'


const fadeImages = [
    "https://images.pexels.com/photos/262978/pexels-photo-262978.jpeg?auto=compress&cs=tinysrgb&w=600",
    "https://images.pexels.com/photos/1267320/pexels-photo-1267320.jpeg?auto=compress&cs=tinysrgb&w=600",
    "https://images.pexels.com/photos/958545/pexels-photo-958545.jpeg?auto=compress&cs=tinysrgb&w=600"
];
// const Slideshow = () => {
//     return (
//       <div className="slide-container">
//         <Fade>
//           {fadeImages.map((fadeImage, index) => (
//             <div className="each-fade" key={index}>
//               <div className="image-container">
//                 <img src={fadeImage.url} width="100%" height="380"  />
//               </div>
//               <h2>{fadeImage.caption}</h2>
//             </div>
//           ))}
//         </Fade>
//       </div>
//     )
//   }

//   const fadeImages = [
//     {
//     url: 'homepage2',

//     },
//     {
//     url: 'homepage2',

//     },
//     {
//     url: 'homepage3',

//     },
//     {url:'homepage4'
//     }
//   ];
function Corousal(props) {




    return (
        <div className="carousel-inner col-lg-17">


            <div className="carousel-item active" >
                <div className="slide-container">
                    <Fade>
                        <div className="each-fade" >
                            <img src={fadeImages[0]} width="100%" height="380"/>
                        </div>
                        <div className="each-fade" >
                            <img src={fadeImages[1]} width="100%" height="380"/>
                        </div>
                        <div className="each-fade" >
                            <img src={fadeImages[2]} width="100%" height="380"/>
                        </div>
                    </Fade>
                </div>
                {/* <div class="float-none"><img src={homepage} width="100%" height="380" /></div> */}
            </div>





        </div>
    );
}

export default Corousal;
