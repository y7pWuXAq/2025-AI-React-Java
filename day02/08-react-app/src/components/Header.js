import React from "react";

/* 링크 처리를 위한 라이브러리 */
// - 클릭하는 링크는 Router와 연결하여 사용
import { Link } from "react-router-dom";

/* 스타일 적용 */
import style from "../css/layout.module.css"

function Header() {
    return(
        /* import 스타일을 적용한 navbar : ../css/layout.module.css 사용 */
        // <nav className={style.nav}> 
        //     <ul>
        //         <li>
        //             {/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
        //             <Link to="/" >[HOME]</Link>
        //         </li>
        //         <li>
        //             {/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
        //             <Link to="/day02_05" >[day02_05]</Link>
        //         </li>
        //         <li>
        //             {/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
        //             <Link to="/day02_06" >[day02_06]</Link>
        //         </li>
        //         <li>
        //             {/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
        //             <Link to="/day02_07" >[day02_07]</Link>
        //         </li>
        //     </ul>
        // </nav>

        /* Bootstrap 사용 : index.html의 CDN 방식 적용 */
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
            <div className="container-fluid">
				{/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
				<Link className="navbar-brand" to="/" >[HOME]</Link>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
                <div className="collapse navbar-collapse" id="navbarNav">
					<ul className="navbar-nav">
						<li className="nav-item">
							{/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
							<Link to="/day02_05" >[day02_05]</Link>
						</li>
						<li className="nav-item">
							{/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
							<Link to="/day02_06" >[day02_06]</Link>
						</li>
						<li className="nav-item">
							{/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
							<Link to="/day02_07" >[day02_07]</Link>
						</li>
						<li className="nav-item">
							{/* 클릭하면 -> App.js에서 URL 패턴에 의해 해당 페이지를 찾아서 처리 */}
							<Link to="/day02_bootstrap" >[day02_bootstrap]</Link>
						</li>
					</ul>
                </div>
            </div>
        </nav>
    );
}

export default Header;