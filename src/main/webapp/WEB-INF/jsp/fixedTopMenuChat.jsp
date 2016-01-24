<%@ include file="/WEB-INF/jsp/includes/siteTags.jsp"%>
    <header>
	    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	        <div class="container">
	            <div class="navbar-header">
	                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
	                    <span class="sr-only">Toggle navigation</span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                </button>
	                <a class="navbar-brand" href="<c:url value='/muns/munstalkDaily.go'/>">
	                     <span class="brand-logo">Munstalk</span> 
	                     <span class="glyphicon glyphicon-comment" aria-hidden="true"></span>
	                 </a>
	            </div>
	
	            <%-- Collect the nav links, forms, and other content for toggling --%>
	            <div class="collapse navbar-collapse navbar-ex1-collapse">
	                <ul class="nav navbar-nav">
	                    <li>
	                        <a href="#">Search</a>
	                    </li>
	                    <li>
	                        <a href="#">Filter</a>
	                    </li>
	                    <li>
	                        <a href="#">Clear</a>
	                    </li>
	                </ul>
	                <ul class="nav navbar-nav pull-right">
	                   <li><a href="http://abuabdul.com">&copy; abuabdul.com 2013-2016</span></a>
	                </ul>
	            </div>
	        </div>
	    </nav>
	</header>