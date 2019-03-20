<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% String uri = request.getServletPath();
	String edited = uri.substring(uri.lastIndexOf("/")+1);
	
	String fin = edited.replaceAll(".jsp", "");
	
	
%>

<!-- SLIDER EXAMPLE -->
		<section class="example">
			<article class="content">
			

				<div id="rev_slider_20_1_wrapper" class="rev_slider_wrapper fullwidthbanner-container" data-alias="image-hero20" style="margin:0px auto;background-color:transparent;padding:0px;margin-top:0px;margin-bottom:0px;">
				<!-- START REVOLUTION SLIDER 5.0.7 fullwidth mode -->
					<div id="rev_slider_20_1" class="rev_slider fullwidthabanner" style="display:none;" data-version="5.0.7">
						<ul>	<!-- SLIDE  -->
							<li data-index="rs-68" data-transition="zoomout" data-slotamount="default"  data-easein="Power4.easeInOut" data-easeout="Power4.easeInOut" data-masterspeed="2000"  data-thumb="../../assets/images/notgenericherobg-100x50.jpg"  data-rotate="0"  data-saveperformance="off"  data-title="Intro" data-description="">
								<!-- MAIN IMAGE -->
								<img src="https://www.statravel.com/static/us_division_web_live/assets/sta-travel-default-min.jpg"  alt=""  data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="10" class="rev-slidebg" data-no-retina>
								<!-- LAYERS -->

								<!-- LAYER NR. 1 -->
								<div class="tp-caption tp-shape tp-shapewrapper   rs-parallaxlevel-0" 
									 id="slide-68-layer-10" 
									 data-x="['center','center','center','center']" data-hoffset="['0','0','0','0']" 
									 data-y="['middle','middle','middle','middle']" data-voffset="['0','0','0','0']" 
												data-width="full"
									data-height="full"
									data-whitespace="nowrap"
									data-transform_idle="o:1;"
						 
									 data-transform_in="opacity:0;s:1500;e:Power3.easeInOut;" 
									 data-transform_out="s:300;s:300;" 
									data-start="750" 
									data-basealign="slide" 
									data-responsive_offset="on" 
									data-responsive="off"
									
									style="z-index: 5;background-color:rgba(0, 0, 0, 0.20);border-color:rgba(0, 0, 0, 0.50);"> 
								</div>

								<!-- LAYER NR. 2 -->
								<div class="tp-caption NotGeneric-Icon   tp-resizeme rs-parallaxlevel-0" 
									 id="slide-68-layer-8" 
									 data-x="['center','center','center','center']" data-hoffset="['0','0','0','0']" 
									 data-y="['middle','middle','middle','middle']" data-voffset="['-66','-68','-78','-78']" 
												data-width="none"
									data-height="none"
									data-whitespace="nowrap"
									data-transform_idle="o:1;"
										data-style_hover="cursor:default;"
						 
									 data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:1500;e:Power4.easeInOut;" 
									 data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;" 
									 data-mask_in="x:0px;y:[100%];s:inherit;e:inherit;" 
									 data-mask_out="x:inherit;y:inherit;s:inherit;e:inherit;" 
									data-start="1000" 
									data-splitin="none" 
									data-splitout="none" 
									data-responsive_offset="on" 

									
									style="z-index: 6; white-space: nowrap;"><i class="pe-7s-paper-plane"></i> 
								</div>

								<!-- LAYER NR. 3 -->
								<div class="tp-caption NotGeneric-Title   tp-resizeme rs-parallaxlevel-0" 
									 id="slide-68-layer-1" 
									 data-x="['center','center','center','center']" data-hoffset="['0','0','0','0']" 
									 data-y="['middle','middle','middle','middle']" data-voffset="['0','0','-22','-29']" 
												data-fontsize="['70','70','70','50']"
									data-lineheight="['70','70','70','50']"
									data-width="none"
									data-height="none"
									data-whitespace="nowrap"
									data-transform_idle="o:1;"
						 
									 data-transform_in="z:0;rX:0deg;rY:0;rZ:0;sX:1.5;sY:1.5;skX:0;skY:0;opacity:0;s:1500;e:Power4.easeInOut;" 
									 data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;" 
									 data-mask_in="x:0px;y:0px;" 
									 data-mask_out="x:inherit;y:inherit;" 
									data-start="1000" 
									data-splitin="none" 
									data-splitout="none" 
									data-responsive_offset="on" 

									
									style="z-index: 7; white-space: nowrap; text-transform: Capitalize;"><%= fin %>
								</div>

							

								
							</li>
						</ul>
						<div class="tp-static-layers"></div>
						<div class="tp-bannertimer tp-bottom" style="visibility: hidden !important;"></div>	
					</div>
				</div><!-- END REVOLUTION SLIDER -->
				<script type="text/javascript">
					var tpj=jQuery;					
					var revapi20;
					tpj(document).ready(function() {
						if(tpj("#rev_slider_20_1").revolution == undefined){
							revslider_showDoubleJqueryError("#rev_slider_20_1");
						}else{
							revapi20 = tpj("#rev_slider_20_1").show().revolution({
								sliderType:"hero",
								jsFileLocation:"../../revolution/js/",
								sliderLayout:"fullwidth",
								dottedOverlay:"none",
								delay:0000,
								navigation: {
								},
								responsiveLevels:[1240,1024,778,480],
								gridwidth:[1240,1024,778,480],
								gridheight:[400,500,400,300],
								lazyType:"none",
								parallax: {
									type:"mouse",
									origo:"slidercenter",
									speed:2000,
									levels:[2,3,4,5,6,7,12,16,10,50],
								},
								shadow:0,
								spinner:"off",
								autoHeight:"off",
								disableProgressBar:"on",
								hideThumbsOnMobile:"off",
								hideSliderAtLimit:0,
								hideCaptionAtLimit:0,
								hideAllCaptionAtLilmit:0,
								debugMode:false,
								fallbacks: {
									simplifyAll:"off",
									disableFocusListener:false,
								}
							});
						}
					});	/*ready*/
				</script>
			</article>
		</section>